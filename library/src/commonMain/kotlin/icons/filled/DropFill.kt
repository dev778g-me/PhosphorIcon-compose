package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DropFill: ImageVector
    get() {
        if (_DropFill != null) {
            return _DropFill!!
        }
        _DropFill = ImageVector.Builder(
            name = "Filled.DropFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(174f, 47.75f)
                arcToRelative(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -41.45f, -38.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.18f, 0f)
                arcTo(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 82f, 47.75f)
                curveTo(54.51f, 79.32f, 40f, 112.6f, 40f, 144f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 0f)
                curveTo(216f, 112.6f, 201.49f, 79.32f, 174f, 47.75f)
                close()
                moveTo(183.85f, 153.34f)
                arcToRelative(57.6f, 57.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46.56f, 46.55f)
                arcTo(8.75f, 8.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -15.89f)
                curveToRelative(16.57f, -2.79f, 30.63f, -16.85f, 33.44f, -33.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.78f, 2.68f)
                close()
            }
        }.build()

        return _DropFill!!
    }

@Suppress("ObjectPropertyName")
private var _DropFill: ImageVector? = null
