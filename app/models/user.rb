# == Schema Information
#
# Table name: users
#
#  id              :integer         not null, primary key
#  name            :string(255)
#  email           :string(255)
#  created_at      :datetime        not null
#  updated_at      :datetime        not null
#  password_digest :string(255)
#  remember_token  :string(255)
#  admin           :boolean         default(FALSE)
#

class User < ActiveRecord::Base
  attr_accessible :email, :name, :password, :password_confirmation
  has_secure_password
  has_many :microposts, dependent: :destroy
  has_many :relationships, foreign_key: "follower_id", dependent: :destroy
  has_many :followed_users, through: :relationships, source: :followed
  has_many :reverse_relationships, foreign_key: "followed_id", 
                                   class_name: "Relationship", 
                                   dependent:  :destroy
  has_many :followers, through: :reverse_relationships, source: :follower

  has_many :user_cat_relationships, foreign_key: "user_id", dependent: :destroy
  has_many :categories, through: :user_cat_relationships, source: :category
  has_many :user_dancer_relationships, foreign_key: "user_id", dependent: :destroy
  has_many :dancers, through: :user_dancer_relationships, source: :dancer
  
#  accepts_nested_attributes_for :categories

  before_save { |user| user.email = email.downcase } 
  before_save :create_remember_token
  validates :name, presence: true, length: { maximum: 50 }
  VALID_EMAIL_REGEX = /\A[\w+\-.]+@[a-z\d\-.]+\.[a-z]+\z/i
  validates :email, presence: true, format: { with: VALID_EMAIL_REGEX }, uniqueness: { case_sensitive: false }

  validates :password, length: { minimum: 6}
  validates :password_confirmation, presence: true

  def categoryVideos(cat_id)
    Video.from_category(self, cat_id)  
  end   

  def dancerVideos 
   # Micropost.where("user_id = ?", id)
   #Micropost.from_users_followed_by(self)
   Video.from_dancers_followed_by(self)
  end

  def following?(other_user)
    relationships.find_by_followed_id(other_user.id)
  end

  def follow!(other_user)
    relationships.create!(followed_id: other_user.id)
  end

  def unfollow!(other_user)
    relationships.find_by_followed_id(other_user.id).destroy
  end

  def followCat!(category)
    user_cat_relationships.create!(category_id: category.id)
  end

  def followingCat?(category)
    user_cat_relationships.find_by_category_id(category.id)
  end

  def followingCatId?(category_id)
    user_cat_relationships.find_by_category_id(category_id)
  end

  def unfollowCat!(category)
    user_cat_relationships.find_by_category_id(category.id).destroy
  end

  def followingDancer?(dancer)
    user_dancer_relationships.find_by_dancer_id(dancer.id)
  end

  def followDancer!(dancer)
    user_dancer_relationships.create!(dancer_id: dancer.id, category_id: dancer.category_id)
  end

  def unfollowDancer!(dancer)
    user_dancer_relationships.find_by_dancer_id(dancer.id).destroy
  end

  private
    def create_remember_token
      self.remember_token = SecureRandom.urlsafe_base64
    end
  
end
