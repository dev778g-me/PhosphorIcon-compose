package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HouseLineFill: ImageVector
    get() {
        if (_HouseLineFill != null) {
            return _HouseLineFill!!
        }
        _HouseLineFill = ImageVector.Builder(
            name = "Filled.HouseLineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 208f)
                lineTo(224f, 208f)
                lineTo(224f, 136f)
                lineToRelative(2.34f, 2.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.66f, 127f)
                lineTo(139.31f, 28.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
                lineTo(18.34f, 127f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.31f)
                lineTo(32f, 136f)
                verticalLineToRelative(72f)
                lineTo(16f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(240f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(152f, 208f)
                lineTo(104f, 208f)
                lineTo(104f, 160f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineToRelative(40f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                close()
            }
        }.build()

        return _HouseLineFill!!
    }

@Suppress("ObjectPropertyName")
private var _HouseLineFill: ImageVector? = null
