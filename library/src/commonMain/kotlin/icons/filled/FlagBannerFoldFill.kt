package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlagBannerFoldFill: ImageVector
    get() {
        if (_FlagBannerFoldFill != null) {
            return _FlagBannerFoldFill!!
        }
        _FlagBannerFoldFill = ImageVector.Builder(
            name = "Filled.FlagBannerFoldFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(131.79f, 69.65f)
                lineToRelative(-43.63f, 96f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.52f, 168f)
                horizontalLineTo(28.23f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.58f, -3.13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -10.25f)
                lineTo(57.19f, 116f)
                lineTo(22.08f, 77.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.43f, -10.26f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.23f, 64f)
                horizontalLineToRelative(99.92f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.79f, 69.65f)
                close()
                moveTo(237.56f, 42.24f)
                arcTo(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.77f, 40f)
                horizontalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.28f, 4.69f)
                lineToRelative(-42.57f, 93.65f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.64f, 5.66f)
                horizontalLineToRelative(57.79f)
                lineToRelative(-34.86f, 76.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.56f, 6.62f)
                lineToRelative(80f, -176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.56f, 42.24f)
                close()
            }
        }.build()

        return _FlagBannerFoldFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerFoldFill: ImageVector? = null
