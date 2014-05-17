class UserDancerRelationship < ActiveRecord::Base
  attr_accessible :dancer_id, :user_id, :category_id

  belongs_to :user, class_name: "User"
  belongs_to :dancer, class_name: "Dancer"

  validates :user_id, presence: true
  validates :dancer_id, presence: true
end
