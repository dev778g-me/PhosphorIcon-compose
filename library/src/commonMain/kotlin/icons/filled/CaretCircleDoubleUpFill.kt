package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CaretCircleDoubleUpFill: ImageVector
    get() {
        if (_CaretCircleDoubleUpFill != null) {
            return _CaretCircleDoubleUpFill!!
        }
        _CaretCircleDoubleUpFill = ImageVector.Builder(
            name = "Filled.CaretCircleDoubleUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(201.58f, 201.57f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, -147.15f, 0f)
                arcTo(104.17f, 104.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 201.58f, 201.57f)
                close()
                moveTo(101.65f, 117.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(128f, 91.29f)
                close()
                moveTo(101.65f, 173.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(128f, 147.32f)
                close()
            }
        }.build()

        return _CaretCircleDoubleUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretCircleDoubleUpFill: ImageVector? = null
