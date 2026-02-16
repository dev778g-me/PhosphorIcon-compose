package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PaypalLogoFill: ImageVector
    get() {
        if (_PaypalLogoFill != null) {
            return _PaypalLogoFill!!
        }
        _PaypalLogoFill = ImageVector.Builder(
            name = "Filled.PaypalLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(220.12f, 93.54f)
                arcToRelative(55.8f, 55.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.19f, -16.18f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 24f)
                lineTo(84f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 68.48f, 36.12f)
                lineToRelative(-36f, 144f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 200f)
                horizontalLineToRelative(27.5f)
                lineToRelative(-3f, 12.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 232f)
                horizontalLineToRelative(31.5f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 135f, 219.88f)
                lineTo(144f, 184f)
                horizontalLineToRelative(32f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.14f, -90.46f)
                close()
                moveTo(48f, 184f)
                lineTo(84f, 40f)
                horizontalLineToRelative(60f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.3f, 32.49f)
                arcTo(57f, 57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 72f)
                lineTo(120f, 72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.53f, 12.12f)
                lineTo(79.52f, 184f)
                lineTo(48f, 184f)
                close()
                moveTo(214.77f, 137.7f)
                arcTo(39.94f, 39.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 168f)
                lineTo(144f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.52f, 12.12f)
                lineToRelative(-9f, 35.88f)
                lineTo(88f, 216f)
                lineToRelative(20f, -80f)
                horizontalLineToRelative(36f)
                arcToRelative(55.9f, 55.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54f, -41.39f)
                arcToRelative(40.2f, 40.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.48f, 8.77f)
                arcTo(39.73f, 39.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 214.78f, 137.7f)
                close()
            }
        }.build()

        return _PaypalLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaypalLogoFill: ImageVector? = null
