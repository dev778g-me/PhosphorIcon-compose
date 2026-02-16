package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ExcludeSquareDuotone: ImageVector
    get() {
        if (_ExcludeSquareDuotone != null) {
            return _ExcludeSquareDuotone!!
        }
        _ExcludeSquareDuotone = ImageVector.Builder(
            name = "Duotone.ExcludeSquareDuotone",
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
                moveTo(160f, 96f)
                lineToRelative(0f, -56f)
                lineToRelative(-120f, 0f)
                lineToRelative(0f, 120f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, -64f)
                lineToRelative(64f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(160f, 96f)
                lineToRelative(0f, 64f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, 56f)
                lineToRelative(120f, 0f)
                lineToRelative(0f, -120f)
                lineToRelative(-56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 96f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
            }
        }.build()

        return _ExcludeSquareDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ExcludeSquareDuotone: ImageVector? = null
