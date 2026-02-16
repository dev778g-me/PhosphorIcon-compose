package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PantsDuotone: ImageVector
    get() {
        if (_PantsDuotone != null) {
            return _PantsDuotone!!
        }
        _PantsDuotone = ImageVector.Builder(
            name = "Duotone.PantsDuotone",
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
                moveTo(193.94f, 39f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186f, 32f)
                horizontalLineTo(70f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.94f, 7f)
                lineTo(54f, 104f)
                curveToRelative(0.68f, 0f, 1.36f, 0f, 2f, 0f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 64f)
                horizontalLineToRelative(64f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                curveToRelative(0.69f, 0f, 1.37f, 0f, 2.05f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(186f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.94f, 7f)
                lineToRelative(22f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.94f, 9f)
                horizontalLineTo(167.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.76f, -6.06f)
                lineTo(128f, 96f)
                lineTo(96.45f, 217.94f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.69f, 224f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.94f, -9f)
                lineToRelative(22f, -176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 70f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 96f)
                lineTo(128f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(58.94f, 64f)
                lineTo(197.06f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 64f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, 40f)
                curveToRelative(-0.69f, 0f, -1.37f, 0f, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(202.06f, 104f)
                curveToRelative(-0.68f, 0f, -1.37f, 0f, -2.06f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
            }
        }.build()

        return _PantsDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PantsDuotone: ImageVector? = null
