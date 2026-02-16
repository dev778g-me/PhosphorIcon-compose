package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GenderNeuterFill: ImageVector
    get() {
        if (_GenderNeuterFill != null) {
            return _GenderNeuterFill!!
        }
        _GenderNeuterFill = ImageVector.Builder(
            name = "Filled.GenderNeuterFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(167.84f, 108.35f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -36.19f, -36.19f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 167.84f, 108.35f)
                close()
                moveTo(216f, 40f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(56f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                lineTo(200f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 40f)
                close()
                moveTo(184f, 112f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 55.42f)
                verticalLineToRelative(32.31f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, -8f)
                lineTo(136f, 167.42f)
                arcTo(56.09f, 56.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 112f)
                close()
            }
        }.build()

        return _GenderNeuterFill!!
    }

@Suppress("ObjectPropertyName")
private var _GenderNeuterFill: ImageVector? = null
