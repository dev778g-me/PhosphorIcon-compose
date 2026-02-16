package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SketchLogoFill: ImageVector
    get() {
        if (_SketchLogoFill != null) {
            return _SketchLogoFill!!
        }
        _SketchLogoFill = ImageVector.Builder(
            name = "Filled.SketchLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(246f, 98.73f)
                lineToRelative(-56f, -64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 32f)
                lineTo(72f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 2.73f)
                lineToRelative(-56f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.17f, 10.73f)
                lineToRelative(112f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.7f, 0f)
                lineToRelative(112f, -120f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 246f, 98.73f)
                close()
                moveTo(222.37f, 96f)
                lineTo(180f, 96f)
                lineTo(144f, 48f)
                horizontalLineToRelative(36.37f)
                close()
                moveTo(74.58f, 112f)
                lineToRelative(30.13f, 75.33f)
                lineTo(34.41f, 112f)
                close()
                moveTo(181.42f, 112f)
                horizontalLineToRelative(40.17f)
                lineToRelative(-70.3f, 75.33f)
                close()
                moveTo(75.63f, 48f)
                lineTo(112f, 48f)
                lineTo(76f, 96f)
                lineTo(33.63f, 96f)
                close()
            }
        }.build()

        return _SketchLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _SketchLogoFill: ImageVector? = null
