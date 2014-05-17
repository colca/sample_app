class UserDancerRelationshipsController < ApplicationController

  before_filter :signed_in_user
  
  def create
    @dancer = Dancer.find(params[:user_dancer_relationship][:dancer_id])
    @category = Category.find(@dancer.category_id)
    current_user.followDancer!(@dancer)
    redirect_to @category
  end

  def destroy
    @dancer = UserDancerRelationship.find(params[:id]).dancer
    @category = Category.find(@dancer.category_id)
    current_user.unfollowDancer!(@dancer)
    redirect_to @category
  end
end
