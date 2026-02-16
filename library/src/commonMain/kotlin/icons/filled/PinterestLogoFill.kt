package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PinterestLogoFill: ImageVector
    get() {
        if (_PinterestLogoFill != null) {
            return _PinterestLogoFill!!
        }
        _PinterestLogoFill = ImageVector.Builder(
            name = "Filled.PinterestLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 128.7f)
                curveToRelative(-0.38f, 56.49f, -46.46f, 102.73f, -102.94f, 103.29f)
                arcToRelative(104.16f, 104.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.94f, -3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.91f, -4.86f)
                lineToRelative(8.64f, -34.55f)
                arcTo(60.57f, 60.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 196f)
                curveToRelative(37f, 0f, 66.7f, -33.45f, 63.81f, -73.36f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 69.24f, 155f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 159.29f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -10.49f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 107.86f, -24.93f)
                curveTo(194f, 154.4f, 171.73f, 180f, 144f, 180f)
                arcToRelative(44.87f, 44.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -23.14f, -6.44f)
                lineToRelative(14.9f, -59.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.52f, -3.88f)
                lineTo(93.38f, 217.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.71f, 2.59f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 126.88f)
                curveTo(32.6f, 70.52f, 78.67f, 24.52f, 135f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128.7f)
                close()
            }
        }.build()

        return _PinterestLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _PinterestLogoFill: ImageVector? = null
