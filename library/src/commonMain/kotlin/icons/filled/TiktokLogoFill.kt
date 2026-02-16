package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TiktokLogoFill: ImageVector
    get() {
        if (_TiktokLogoFill != null) {
            return _TiktokLogoFill!!
        }
        _TiktokLogoFill = ImageVector.Builder(
            name = "Filled.TiktokLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 80f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                arcToRelative(103.25f, 103.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -11.71f)
                verticalLineTo(156f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -152f, 0f)
                curveToRelative(0f, -36.9f, 26.91f, -69.52f, 62.6f, -75.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 88f)
                verticalLineToRelative(42.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.57f, 7.23f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 120f, 156f)
                verticalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 80f)
                close()
            }
        }.build()

        return _TiktokLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _TiktokLogoFill: ImageVector? = null
