class UserCatRelationship < ActiveRecord::Base
  attr_accessible :category_id, :user_id

  belongs_to :user, class_name: "User"
  belongs_to :category, class_name: "Category"

  validates :user_id, presence: true
  validates :category_id, presence: true
end
