package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlagBannerFill: ImageVector
    get() {
        if (_FlagBannerFill != null) {
            return _FlagBannerFill!!
        }
        _FlagBannerFill = ImageVector.Builder(
            name = "Filled.FlagBannerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.22f, 59.44f)
                lineToRelative(-45.63f, 95.82f)
                arcToRelative(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, 0.34f)
                lineToRelative(-34.21f, 71.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.44f, -6.88f)
                lineTo(173.62f, 160f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineTo(76.69f, 104f)
                lineTo(34.34f, 61.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.22f, 11.44f)
                close()
            }
        }.build()

        return _FlagBannerFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerFill: ImageVector? = null
