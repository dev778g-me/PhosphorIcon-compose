package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrainRegionalFill: ImageVector
    get() {
        if (_TrainRegionalFill != null) {
            return _TrainRegionalFill!!
        }
        _TrainRegionalFill = ImageVector.Builder(
            name = "Filled.TrainRegionalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(96f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 88f)
                close()
                moveTo(223.72f, 122.1f)
                lineTo(201.33f, 204.21f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 185.89f, 216f)
                lineTo(176f, 216f)
                lineToRelative(14.4f, 19.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.8f, 9.6f)
                lineTo(156f, 216f)
                lineTo(100f, 216f)
                lineTo(78.4f, 244.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.8f, -9.6f)
                lineTo(80f, 216f)
                lineTo(70.11f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.44f, -11.79f)
                lineTo(32.28f, 122.1f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.2f)
                lineTo(54.67f, 35.79f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 70.11f, 24f)
                lineTo(185.89f, 24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.44f, 11.79f)
                lineToRelative(22.39f, 82.11f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.72f, 122.1f)
                close()
                moveTo(136f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(206f, 113.69f)
                lineTo(185.89f, 40f)
                lineTo(70.11f, 40f)
                lineTo(50f, 113.69f)
                lineToRelative(78f, 14.18f)
                close()
            }
        }.build()

        return _TrainRegionalFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrainRegionalFill: ImageVector? = null
