package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrainFill: ImageVector
    get() {
        if (_TrainFill != null) {
            return _TrainFill!!
        }
        _TrainFill = ImageVector.Builder(
            name = "Filled.TrainFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 24f)
                lineTo(72f, 24f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                lineTo(40f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                horizontalLineToRelative(8f)
                lineTo(65.6f, 235.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.8f, 9.6f)
                lineTo(100f, 216f)
                horizontalLineToRelative(56f)
                lineToRelative(21.6f, 28.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.8f, -9.6f)
                lineTo(176f, 216f)
                horizontalLineToRelative(8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                lineTo(216f, 56f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 24f)
                close()
                moveTo(84f, 184f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 184f)
                close()
                moveTo(120f, 120f)
                lineTo(56f, 120f)
                lineTo(56f, 80f)
                horizontalLineToRelative(64f)
                close()
                moveTo(172f, 184f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 184f)
                close()
                moveTo(200f, 120f)
                lineTo(136f, 120f)
                lineTo(136f, 80f)
                horizontalLineToRelative(64f)
                close()
            }
        }.build()

        return _TrainFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrainFill: ImageVector? = null
