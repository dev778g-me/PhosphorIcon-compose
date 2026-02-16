package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MapPinLineFill: ImageVector
    get() {
        if (_MapPinLineFill != null) {
            return _MapPinLineFill!!
        }
        _MapPinLineFill = ImageVector.Builder(
            name = "Filled.MapPinLineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 224f)
                horizontalLineTo(150.54f)
                arcTo(266.56f, 266.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 174f, 200.25f)
                curveToRelative(27.45f, -31.57f, 42f, -64.85f, 42f, -96.25f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -176f, 0f)
                curveToRelative(0f, 31.4f, 14.51f, 64.68f, 42f, 96.25f)
                arcTo(266.56f, 266.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 105.46f, 224f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(128f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 72f)
                close()
            }
        }.build()

        return _MapPinLineFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinLineFill: ImageVector? = null
