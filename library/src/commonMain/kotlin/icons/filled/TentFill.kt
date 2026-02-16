package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TentFill: ImageVector
    get() {
        if (_TentFill != null) {
            return _TentFill!!
        }
        _TentFill = ImageVector.Builder(
            name = "Filled.TentFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(255.31f, 188.75f)
                lineToRelative(-64f, -144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 40f)
                lineTo(72f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.31f, 4.75f)
                horizontalLineToRelative(0f)
                lineToRelative(0f, 0.12f)
                verticalLineToRelative(0f)
                lineTo(0.69f, 188.75f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 200f)
                lineTo(248f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.31f, -11.25f)
                close()
                moveTo(64f, 184f)
                lineTo(20.31f, 184f)
                lineTo(64f, 85.7f)
                close()
                moveTo(80f, 184f)
                lineTo(80f, 85.7f)
                lineTo(123.69f, 184f)
                close()
            }
        }.build()

        return _TentFill!!
    }

@Suppress("ObjectPropertyName")
private var _TentFill: ImageVector? = null
