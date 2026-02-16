package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CarProfileFill: ImageVector
    get() {
        if (_CarProfileFill != null) {
            return _CarProfileFill!!
        }
        _CarProfileFill = ImageVector.Builder(
            name = "Filled.CarProfileFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 112f)
                lineTo(211.31f, 112f)
                lineTo(168f, 68.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156.69f, 64f)
                lineTo(44.28f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31f, 71.12f)
                lineTo(1.34f, 115.56f)
                arcTo(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 120f)
                verticalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(33f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62f, 0f)
                horizontalLineToRelative(66f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62f, 0f)
                horizontalLineToRelative(17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(256f, 128f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 112f)
                close()
                moveTo(44.28f, 80f)
                lineTo(156.69f, 80f)
                lineToRelative(32f, 32f)
                lineTo(23f, 112f)
                close()
                moveTo(64f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 192f)
                close()
                moveTo(192f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 192f)
                close()
            }
        }.build()

        return _CarProfileFill!!
    }

@Suppress("ObjectPropertyName")
private var _CarProfileFill: ImageVector? = null
