package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WaveTriangleFill: ImageVector
    get() {
        if (_WaveTriangleFill != null) {
            return _WaveTriangleFill!!
        }
        _WaveTriangleFill = ImageVector.Builder(
            name = "Filled.WaveTriangleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(206.15f, 133.12f)
                lineTo(166.15f, 181.12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 184f)
                horizontalLineToRelative(-0.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.23f, -3.55f)
                lineToRelative(-58f, -87.09f)
                lineTo(62.15f, 133.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.3f, -10.24f)
                lineToRelative(40f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.81f, 0.68f)
                lineToRelative(58.05f, 87.09f)
                lineToRelative(33.14f, -39.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.3f, 10.24f)
                close()
            }
        }.build()

        return _WaveTriangleFill!!
    }

@Suppress("ObjectPropertyName")
private var _WaveTriangleFill: ImageVector? = null
