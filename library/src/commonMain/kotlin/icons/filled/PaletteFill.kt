package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PaletteFill: ImageVector
    get() {
        if (_PaletteFill != null) {
            return _PaletteFill!!
        }
        _PaletteFill = ImageVector.Builder(
            name = "Filled.PaletteFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200.77f, 53.89f)
                arcTo(103.27f, 103.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                horizontalLineToRelative(-1.07f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 128f)
                curveToRelative(0f, 43f, 26.58f, 79.06f, 69.36f, 94.17f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                horizontalLineToRelative(46.21f)
                arcToRelative(31.81f, 31.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.2f, -24.88f)
                arcToRelative(104.43f, 104.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.59f, -24f)
                arcTo(103.28f, 103.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.77f, 53.89f)
                close()
                moveTo(84f, 168f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 168f)
                close()
                moveTo(84f, 112f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 112f)
                close()
                moveTo(128f, 88f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 88f)
                close()
                moveTo(172f, 112f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 112f)
                close()
            }
        }.build()

        return _PaletteFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaletteFill: ImageVector? = null
