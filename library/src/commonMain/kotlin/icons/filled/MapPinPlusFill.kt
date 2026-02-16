package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MapPinPlusFill: ImageVector
    get() {
        if (_MapPinPlusFill != null) {
            return _MapPinPlusFill!!
        }
        _MapPinPlusFill = ImageVector.Builder(
            name = "Filled.MapPinPlusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 16f)
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -88f, 88f)
                curveToRelative(0f, 31.4f, 14.51f, 64.68f, 42f, 96.25f)
                arcToRelative(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 41.45f, 38.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.18f, 0f)
                arcTo(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 174f, 200.25f)
                curveToRelative(27.45f, -31.57f, 42f, -64.85f, 42f, -96.25f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 16f)
                close()
                moveTo(160f, 112f)
                lineTo(136f, 112f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 112f)
                lineTo(96f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(24f)
                lineTo(120f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(136f, 96f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _MapPinPlusFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinPlusFill: ImageVector? = null
