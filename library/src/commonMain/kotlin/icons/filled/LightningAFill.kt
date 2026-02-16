package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LightningAFill: ImageVector
    get() {
        if (_LightningAFill != null) {
            return _LightningAFill!!
        }
        _LightningAFill = ImageVector.Builder(
            name = "Filled.LightningAFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(173.87f, 118.58f)
                lineTo(78.67f, 221.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65f, 214.15f)
                lineToRelative(13.67f, -57.56f)
                lineToRelative(-50f, -22.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.59f, -12.73f)
                lineToRelative(95.2f, -102.85f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 135f, 25.85f)
                lineTo(121.31f, 83.41f)
                lineToRelative(50f, 22.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.59f, 12.74f)
                close()
                moveTo(235.58f, 223.15f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, -4.42f)
                lineTo(215.05f, 200f)
                lineTo(176.94f, 200f)
                lineToRelative(-9.79f, 19.58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.31f, -7.16f)
                lineToRelative(36f, -72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.31f, 0f)
                lineToRelative(36f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 235.58f, 223.15f)
                close()
                moveTo(207.05f, 184f)
                lineTo(196f, 161.89f)
                lineTo(184.94f, 184f)
                close()
            }
        }.build()

        return _LightningAFill!!
    }

@Suppress("ObjectPropertyName")
private var _LightningAFill: ImageVector? = null
