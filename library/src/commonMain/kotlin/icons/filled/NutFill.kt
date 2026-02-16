package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NutFill: ImageVector
    get() {
        if (_NutFill != null) {
            return _NutFill!!
        }
        _NutFill = ImageVector.Builder(
            name = "Filled.NutFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(223.68f, 66.15f)
                lineTo(135.68f, 18f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.36f, 0f)
                lineToRelative(-88f, 48.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.32f, 14f)
                verticalLineToRelative(95.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, 14f)
                lineToRelative(88f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.36f, 0f)
                lineToRelative(88f, -48.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, -14f)
                verticalLineTo(80.18f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.68f, 66.15f)
                close()
                moveTo(128f, 168f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                close()
            }
        }.build()

        return _NutFill!!
    }

@Suppress("ObjectPropertyName")
private var _NutFill: ImageVector? = null
