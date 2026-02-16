package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GithubLogoFill: ImageVector
    get() {
        if (_GithubLogoFill != null) {
            return _GithubLogoFill!!
        }
        _GithubLogoFill = ImageVector.Builder(
            name = "Filled.GithubLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 104f)
                verticalLineToRelative(8f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48.44f, 55.47f)
                arcTo(39.8f, 39.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 192f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(216f)
                horizontalLineTo(72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineTo(96f)
                verticalLineToRelative(-8f)
                arcToRelative(39.8f, 39.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.44f, -24.53f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 112f)
                verticalLineToRelative(-8f)
                arcToRelative(58.14f, 58.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.69f, -28.32f)
                arcTo(59.78f, 59.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.07f, 28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 24f)
                arcToRelative(59.75f, 59.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 24f)
                horizontalLineToRelative(24f)
                arcToRelative(59.75f, 59.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.93f, 4f)
                arcToRelative(59.74f, 59.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.37f, 47.68f)
                arcTo(58f, 58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 104f)
                close()
            }
        }.build()

        return _GithubLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GithubLogoFill: ImageVector? = null
