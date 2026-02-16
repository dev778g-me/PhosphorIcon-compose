package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.VirusFill: ImageVector
    get() {
        if (_VirusFill != null) {
            return _VirusFill!!
        }
        _VirusFill = ImageVector.Builder(
            name = "Filled.VirusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 120f)
                lineTo(223.66f, 120f)
                arcToRelative(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.39f, -53.95f)
                lineToRelative(12.39f, -12.39f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(190f, 54.73f)
                arcTo(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 32.34f)
                lineTo(136f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 32.34f)
                arcTo(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66.05f, 54.73f)
                lineTo(53.66f, 42.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42.34f, 53.66f)
                lineTo(54.73f, 66.05f)
                arcToRelative(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.39f, 54f)
                lineTo(16f, 120.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(32.34f, 136.05f)
                arcTo(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.73f, 190f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineToRelative(12.39f, -12.39f)
                arcToRelative(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54f, 22.39f)
                lineTo(120.05f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136.05f, 223.66f)
                arcTo(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 190f, 201.27f)
                lineToRelative(12.39f, 12.39f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                lineTo(201.27f, 190f)
                arcTo(95.52f, 95.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.66f, 136f)
                lineTo(240f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(80f, 108f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 108f)
                close()
                moveTo(128f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 192f)
                close()
                moveTo(176f, 144f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 144f)
                close()
            }
        }.build()

        return _VirusFill!!
    }

@Suppress("ObjectPropertyName")
private var _VirusFill: ImageVector? = null
