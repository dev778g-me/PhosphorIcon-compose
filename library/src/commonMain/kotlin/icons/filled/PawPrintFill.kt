package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PawPrintFill: ImageVector
    get() {
        if (_PawPrintFill != null) {
            return _PawPrintFill!!
        }
        _PawPrintFill = ImageVector.Builder(
            name = "Filled.PawPrintFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 108f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 108f)
                close()
                moveTo(72f, 108f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 108f)
                close()
                moveTo(92f, 88f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 60f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 88f)
                close()
                moveTo(164f, 88f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164f, 88f)
                close()
                moveTo(187.12f, 148.86f)
                arcToRelative(35.3f, 35.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.87f, -21.14f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -84.5f, 0f)
                arcTo(35.25f, 35.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69f, 148.82f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 224f)
                arcToRelative(39.48f, 39.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.52f, -3.13f)
                arcToRelative(64.09f, 64.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48.87f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.73f, -72f)
                close()
            }
        }.build()

        return _PawPrintFill!!
    }

@Suppress("ObjectPropertyName")
private var _PawPrintFill: ImageVector? = null
