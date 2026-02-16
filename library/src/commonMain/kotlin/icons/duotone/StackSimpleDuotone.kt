package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.StackSimpleDuotone: ImageVector
    get() {
        if (_StackSimpleDuotone != null) {
            return _StackSimpleDuotone!!
        }
        _StackSimpleDuotone = ImageVector.Builder(
            name = "Duotone.StackSimpleDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(16f, 104f)
                lineToRelative(112f, 64f)
                lineToRelative(112f, -64f)
                lineToRelative(-112f, -64f)
                lineToRelative(-112f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 104f)
                lineToRelative(112f, 64f)
                lineToRelative(112f, -64f)
                lineToRelative(-112f, -64f)
                lineToRelative(-112f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 144f)
                lineToRelative(112f, 64f)
                lineToRelative(112f, -64f)
            }
        }.build()

        return _StackSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StackSimpleDuotone: ImageVector? = null
