package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.StarAndCrescentDuotone: ImageVector
    get() {
        if (_StarAndCrescentDuotone != null) {
            return _StarAndCrescentDuotone!!
        }
        _StarAndCrescentDuotone = ImageVector.Builder(
            name = "Duotone.StarAndCrescentDuotone",
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
                moveTo(152f, 206.4f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -156.8f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 156.8f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(177.46f, 128f)
                lineToRelative(-17.46f, -29.67f)
                lineToRelative(32.59f, 8.07f)
                lineToRelative(21.8f, -26.4f)
                lineToRelative(2.67f, 34.65f)
                lineToRelative(30.94f, 13.35f)
                lineToRelative(-30.94f, 13.35f)
                lineToRelative(-2.67f, 34.65f)
                lineToRelative(-21.8f, -26.4f)
                lineToRelative(-32.59f, 8.07f)
                lineToRelative(17.46f, -29.67f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 206.4f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -156.8f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 156.8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(177.46f, 128f)
                lineToRelative(-17.46f, -29.67f)
                lineToRelative(32.59f, 8.07f)
                lineToRelative(21.8f, -26.4f)
                lineToRelative(2.67f, 34.65f)
                lineToRelative(30.94f, 13.35f)
                lineToRelative(-30.94f, 13.35f)
                lineToRelative(-2.67f, 34.65f)
                lineToRelative(-21.8f, -26.4f)
                lineToRelative(-32.59f, 8.07f)
                lineToRelative(17.46f, -29.67f)
                close()
            }
        }.build()

        return _StarAndCrescentDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StarAndCrescentDuotone: ImageVector? = null
