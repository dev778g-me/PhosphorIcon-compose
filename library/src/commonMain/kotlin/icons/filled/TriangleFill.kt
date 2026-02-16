package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TriangleFill: ImageVector
    get() {
        if (_TriangleFill != null) {
            return _TriangleFill!!
        }
        _TriangleFill = ImageVector.Builder(
            name = "Filled.TriangleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.78f, 211.81f)
                arcTo(24.34f, 24.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.45f, 224f)
                horizontalLineTo(40.55f)
                arcToRelative(24.34f, 24.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.33f, -12.19f)
                arcToRelative(23.51f, 23.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -23.72f)
                lineTo(106.65f, 36.22f)
                arcToRelative(24.76f, 24.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42.7f, 0f)
                lineTo(236.8f, 188.09f)
                arcTo(23.51f, 23.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 236.78f, 211.81f)
                close()
            }
        }.build()

        return _TriangleFill!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleFill: ImageVector? = null
