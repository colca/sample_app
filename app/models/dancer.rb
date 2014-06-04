class Dancer < ActiveRecord::Base
  attr_accessible :category_id, :name
  belongs_to :category
  has_many :user_dancer_relationships, foreign_key: "dancer_id",
                                       class_name: "UserDancerRelationship", 
                                       dependent: :destroy
  has_many :users, through: :user_dancer_relationships, source: :user  

  validates :category_id, presence: true
  validates :name, presence: true, uniqueness: true

  default_scope order: 'dancers.video_count DESC'
end
