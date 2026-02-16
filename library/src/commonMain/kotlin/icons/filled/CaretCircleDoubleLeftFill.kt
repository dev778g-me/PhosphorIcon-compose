package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CaretCircleDoubleLeftFill: ImageVector
    get() {
        if (_CaretCircleDoubleLeftFill != null) {
            return _CaretCircleDoubleLeftFill!!
        }
        _CaretCircleDoubleLeftFill = ImageVector.Builder(
            name = "Filled.CaretCircleDoubleLeftFill",
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
                moveTo(117.65f, 154.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, 11.32f)
                lineToRelative(-32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(91.29f, 128f)
                close()
                moveTo(173.65f, 154.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, 11.32f)
                lineToRelative(-32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(147.32f, 128f)
                close()
            }
        }.build()

        return _CaretCircleDoubleLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretCircleDoubleLeftFill: ImageVector? = null
