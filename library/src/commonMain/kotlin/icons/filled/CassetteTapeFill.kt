package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CassetteTapeFill: ImageVector
    get() {
        if (_CassetteTapeFill != null) {
            return _CassetteTapeFill!!
        }
        _CassetteTapeFill = ImageVector.Builder(
            name = "Filled.CassetteTapeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156.3f, 96f)
                arcToRelative(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
                lineTo(99.7f, 128f)
                arcToRelative(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                close()
                moveTo(72f, 96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 96f)
                close()
                moveTo(240f, 64f)
                lineTo(240f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 48f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 64f)
                close()
                moveTo(186f, 192f)
                lineToRelative(-15.6f, -20.8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164f, 168f)
                lineTo(92f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.4f, 3.2f)
                lineTo(70f, 192f)
                close()
                moveTo(216f, 112f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                lineTo(72f, 80f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 64f)
                lineTo(184f, 144f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 112f)
                close()
                moveTo(184f, 96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 96f)
                close()
            }
        }.build()

        return _CassetteTapeFill!!
    }

@Suppress("ObjectPropertyName")
private var _CassetteTapeFill: ImageVector? = null
