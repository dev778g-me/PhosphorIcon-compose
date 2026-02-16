package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DropHalfBottomFill: ImageVector
    get() {
        if (_DropHalfBottomFill != null) {
            return _DropHalfBottomFill!!
        }
        _DropHalfBottomFill = ImageVector.Builder(
            name = "Filled.DropHalfBottomFill",
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
                moveTo(128f, 26f)
                curveToRelative(14.16f, 11.1f, 56.86f, 47.74f, 68.84f, 94f)
                horizontalLineTo(59.16f)
                curveTo(71.14f, 73.76f, 113.84f, 37.12f, 128f, 26f)
                close()
            }
        }.build()

        return _DropHalfBottomFill!!
    }

@Suppress("ObjectPropertyName")
private var _DropHalfBottomFill: ImageVector? = null
