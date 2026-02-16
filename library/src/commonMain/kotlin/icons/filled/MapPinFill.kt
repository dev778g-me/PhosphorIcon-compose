package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MapPinFill: ImageVector
    get() {
        if (_MapPinFill != null) {
            return _MapPinFill!!
        }
        _MapPinFill = ImageVector.Builder(
            name = "Filled.MapPinFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 16f)
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -88f, 88f)
                curveToRelative(0f, 75.3f, 80f, 132.17f, 83.41f, 134.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.18f, 0f)
                curveTo(136f, 236.17f, 216f, 179.3f, 216f, 104f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 16f)
                close()
                moveTo(128f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 72f)
                close()
            }
        }.build()

        return _MapPinFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinFill: ImageVector? = null
