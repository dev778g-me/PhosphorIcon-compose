package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TagFill: ImageVector
    get() {
        if (_TagFill != null) {
            return _TagFill!!
        }
        _TagFill = ImageVector.Builder(
            name = "Filled.TagFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(243.31f, 136f)
                lineTo(144f, 36.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 132.69f, 32f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(92.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.69f, 144f)
                lineTo(136f, 243.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                lineToRelative(84.68f, -84.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.63f)
                close()
                moveTo(84f, 96f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 84f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 96f)
                close()
            }
        }.build()

        return _TagFill!!
    }

@Suppress("ObjectPropertyName")
private var _TagFill: ImageVector? = null
