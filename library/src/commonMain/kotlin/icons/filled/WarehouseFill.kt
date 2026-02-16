package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WarehouseFill: ImageVector
    get() {
        if (_WarehouseFill != null) {
            return _WarehouseFill!!
        }
        _WarehouseFill = ImageVector.Builder(
            name = "Filled.WarehouseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 184f)
                horizontalLineToRelative(-8f)
                lineTo(232f, 57.9f)
                lineToRelative(9.67f, -2.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.35f, -15.64f)
                lineToRelative(-224f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 104f)
                arcToRelative(8.16f, 8.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, -0.18f)
                lineTo(24f, 102.47f)
                lineTo(24f, 184f)
                lineTo(16f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(240f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(184f, 184f)
                lineTo(72f, 184f)
                lineTo(72f, 168f)
                lineTo(184f, 168f)
                close()
                moveTo(184f, 152f)
                lineTo(72f, 152f)
                lineTo(72f, 136f)
                lineTo(184f, 136f)
                close()
            }
        }.build()

        return _WarehouseFill!!
    }

@Suppress("ObjectPropertyName")
private var _WarehouseFill: ImageVector? = null
