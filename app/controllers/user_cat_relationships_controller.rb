class UserCatRelationshipsController < ApplicationController

  before_filter :signed_in_user
  
  def create
    @category = Category.find(params[:user_cat_relationship][:category_id])
    current_user.followCat!(@category)
    redirect_to categories_path
  end

  def destroy
    @category = UserCatRelationship.find(params[:id]).category
    current_user.unfollowCat!(@category)
    redirect_to categories_path
  end
end
