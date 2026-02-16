package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CaretCircleDoubleRightFill: ImageVector
    get() {
        if (_CaretCircleDoubleRightFill != null) {
            return _CaretCircleDoubleRightFill!!
        }
        _CaretCircleDoubleRightFill = ImageVector.Builder(
            name = "Filled.CaretCircleDoubleRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(201.57f, 54.42f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 147.15f)
                arcTo(104.17f, 104.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 201.57f, 54.42f)
                close()
                moveTo(125.66f, 133.66f)
                lineTo(93.66f, 165.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(108.68f, 128f)
                lineTo(82.32f, 101.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 93.64f, 90.32f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 125.66f, 133.66f)
                close()
                moveTo(181.66f, 133.66f)
                lineTo(149.66f, 165.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(164.71f, 128f)
                lineToRelative(-26.36f, -26.36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 181.68f, 133.66f)
                close()
            }
        }.build()

        return _CaretCircleDoubleRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretCircleDoubleRightFill: ImageVector? = null
