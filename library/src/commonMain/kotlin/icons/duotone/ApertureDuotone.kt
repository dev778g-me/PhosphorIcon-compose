package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ApertureDuotone: ImageVector
    get() {
        if (_ApertureDuotone != null) {
            return _ApertureDuotone!!
        }
        _ApertureDuotone = ImageVector.Builder(
            name = "Duotone.ApertureDuotone",
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
                moveTo(195.88f, 60.12f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 135.76f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 195.88f, 60.12f)
                close()
                moveTo(164.68f, 134.7f)
                lineTo(140.54f, 163.11f)
                horizontalLineToRelative(0f)
                lineToRelative(-36.68f, -6.69f)
                horizontalLineToRelative(0f)
                lineTo(91.32f, 121.3f)
                horizontalLineToRelative(0f)
                lineToRelative(24.14f, -28.41f)
                horizontalLineToRelative(0f)
                lineToRelative(36.68f, 6.69f)
                horizontalLineToRelative(0f)
                lineToRelative(12.54f, 35.12f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 32f)
                lineTo(164.68f, 134.7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44.86f, 80f)
                lineTo(152.14f, 99.58f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44.86f, 176f)
                lineTo(115.46f, 92.89f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 224f)
                lineTo(91.32f, 121.3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(211.14f, 176f)
                lineTo(103.86f, 156.42f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(211.14f, 80f)
                lineTo(140.54f, 163.11f)
            }
        }.build()

        return _ApertureDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ApertureDuotone: ImageVector? = null
