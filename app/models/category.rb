# == Schema Information
#
# Table name: categories
#
#  id         :integer         not null, primary key
#  cName      :string(255)
#  created_at :datetime        not null
#  updated_at :datetime        not null
#

class Category < ActiveRecord::Base
  attr_accessible :cName

  validates :cName, uniqueness: true

  #has_many :reverse_user_cat_relationships, foreign_key: "category_id",
  #                                        class_name: "UserCatRelationship",
  #                                        dependent: :destroy
  #
  has_many :user_cat_relationships, foreign_key: "category_id", 
                                    class_name: "UserCatRelationship",
                                    dependent: :destroy

  has_many :users, through: :user_cat_relationships, source: :user

  accepts_nested_attributes_for :user_cat_relationships
end
