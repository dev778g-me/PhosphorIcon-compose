package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlaskFill: ImageVector
    get() {
        if (_FlaskFill != null) {
            return _FlaskFill!!
        }
        _FlaskFill = ImageVector.Builder(
            name = "Filled.FlaskFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.69f, 199.77f)
                lineTo(160f, 96.92f)
                lineTo(160f, 40f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(88f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                lineTo(96f, 96.92f)
                lineTo(34.31f, 199.77f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 224f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.72f, -24.23f)
                close()
                moveTo(131.61f, 156.86f)
                curveToRelative(-15.91f, -8.05f, -31.05f, -12.32f, -45.22f, -12.81f)
                lineToRelative(24.47f, -40.8f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 99.14f)
                lineTo(112f, 40f)
                horizontalLineToRelative(32f)
                lineTo(144f, 99.14f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, 4.11f)
                lineTo(183.36f, 167f)
                curveTo(171.4f, 169.34f, 154.29f, 168.34f, 131.61f, 156.86f)
                close()
            }
        }.build()

        return _FlaskFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskFill: ImageVector? = null
