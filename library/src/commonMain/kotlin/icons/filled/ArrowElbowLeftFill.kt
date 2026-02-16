package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowElbowLeftFill: ImageVector
    get() {
        if (_ArrowElbowLeftFill != null) {
            return _ArrowElbowLeftFill!!
        }
        _ArrowElbowLeftFill = ImageVector.Builder(
            name = "Filled.ArrowElbowLeftFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.66f, 101.66f)
                lineToRelative(-96f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineTo(60f, 127.31f)
                lineTo(29.66f, 157.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 152f)
                verticalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                lineTo(71.31f, 116f)
                lineTo(136f, 180.69f)
                lineToRelative(90.34f, -90.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
            }
        }.build()

        return _ArrowElbowLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftFill: ImageVector? = null
