package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NuclearPlantFill: ImageVector
    get() {
        if (_NuclearPlantFill != null) {
            return _NuclearPlantFill!!
        }
        _NuclearPlantFill = ImageVector.Builder(
            name = "Filled.NuclearPlantFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 32f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                horizontalLineTo(152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 32f)
                close()
                moveTo(104f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, -40f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineToRelative(-8f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 64f)
                close()
                moveTo(248f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(32.74f)
                curveToRelative(13.77f, -27.83f, 29.48f, -68.69f, 31.12f, -112.66f)
                arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.85f, 80f)
                horizontalLineToRelative(88.33f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15.28f)
                curveToRelative(2.1f, 47.84f, 23.84f, 92.37f, 35.29f, 112.72f)
                horizontalLineTo(240f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 216f)
                close()
                moveTo(168.18f, 96f)
                horizontalLineToRelative(-16f)
                curveToRelative(1.77f, 43.72f, 17.39f, 84.32f, 31.09f, 112f)
                horizontalLineToRelative(18f)
                curveTo(188.68f, 184.08f, 170.18f, 141.64f, 168.18f, 96f)
                close()
            }
        }.build()

        return _NuclearPlantFill!!
    }

@Suppress("ObjectPropertyName")
private var _NuclearPlantFill: ImageVector? = null
