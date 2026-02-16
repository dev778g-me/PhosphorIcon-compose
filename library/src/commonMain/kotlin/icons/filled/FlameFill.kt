package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlameFill: ImageVector
    get() {
        if (_FlameFill != null) {
            return _FlameFill!!
        }
        _FlameFill = ImageVector.Builder(
            name = "Filled.FlameFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(173.79f, 51.48f)
                arcToRelative(221.25f, 221.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -41.67f, -34.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.24f, 0f)
                arcTo(221.25f, 221.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 82.21f, 51.48f)
                curveTo(54.59f, 80.48f, 40f, 112.47f, 40f, 144f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 0f)
                curveTo(216f, 112.47f, 201.41f, 80.48f, 173.79f, 51.48f)
                close()
                moveTo(96f, 184f)
                curveToRelative(0f, -27.67f, 22.53f, -47.28f, 32f, -54.3f)
                curveToRelative(9.48f, 7f, 32f, 26.63f, 32f, 54.3f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                close()
            }
        }.build()

        return _FlameFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlameFill: ImageVector? = null
