package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SwatchesFill: ImageVector
    get() {
        if (_SwatchesFill != null) {
            return _SwatchesFill!!
        }
        _SwatchesFill = ImageVector.Builder(
            name = "Filled.SwatchesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 155.91f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -5.22f)
                lineTo(219.94f, 98.48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 199.49f, 89f)
                lineToRelative(-67.81f, 24.57f)
                lineToRelative(12.08f, -69f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 130.84f, 26f)
                lineTo(76.17f, 16.25f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.47f, 13f)
                lineToRelative(-25f, 143.12f)
                arcTo(43.82f, 43.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 75.78f, 224f)
                lineTo(224f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                close()
                moveTo(76f, 196f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 196f)
                close()
                moveTo(118.72f, 187.62f)
                lineTo(128.5f, 131.7f)
                lineTo(204.92f, 104f)
                lineTo(224f, 156.11f)
                lineTo(116.78f, 195f)
                arcTo(44.89f, 44.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 118.72f, 187.62f)
                close()
                moveTo(224f, 208f)
                lineTo(127.74f, 208f)
                lineTo(224f, 173.11f)
                close()
            }
        }.build()

        return _SwatchesFill!!
    }

@Suppress("ObjectPropertyName")
private var _SwatchesFill: ImageVector? = null
