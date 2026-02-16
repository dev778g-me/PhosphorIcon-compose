package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DeviceMobileFill: ImageVector
    get() {
        if (_DeviceMobileFill != null) {
            return _DeviceMobileFill!!
        }
        _DeviceMobileFill = ImageVector.Builder(
            name = "Filled.DeviceMobileFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 16f)
                lineTo(80f, 16f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                lineTo(56f, 216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(200f, 40f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 16f)
                close()
                moveTo(80f, 32f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(8f)
                lineTo(72f, 48f)
                lineTo(72f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 32f)
                close()
                moveTo(176f, 224f)
                lineTo(80f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineToRelative(-8f)
                lineTo(184f, 208f)
                verticalLineToRelative(8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 224f)
                close()
            }
        }.build()

        return _DeviceMobileFill!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMobileFill: ImageVector? = null
