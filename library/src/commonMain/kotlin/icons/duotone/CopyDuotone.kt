package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CopyDuotone: ImageVector
    get() {
        if (_CopyDuotone != null) {
            return _CopyDuotone!!
        }
        _CopyDuotone = ImageVector.Builder(
            name = "Duotone.CopyDuotone",
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
                moveTo(88f, 40f)
                lineToRelative(0f, 48f)
                lineToRelative(80f, 0f)
                lineToRelative(0f, 80f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, -128f)
                lineToRelative(-128f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 168f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, -128f)
                lineToRelative(-128f, 0f)
                lineToRelative(0f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 88f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(-128f)
                close()
            }
        }.build()

        return _CopyDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CopyDuotone: ImageVector? = null
