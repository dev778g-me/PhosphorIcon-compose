package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.OpenAiLogoDuotone: ImageVector
    get() {
        if (_OpenAiLogoDuotone != null) {
            return _OpenAiLogoDuotone!!
        }
        _OpenAiLogoDuotone = ImageVector.Builder(
            name = "Duotone.OpenAiLogoDuotone",
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
                moveTo(51.5f, 148.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.38f, -8.08f)
                horizontalLineToRelative(0f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66.4f, 64.08f)
                lineTo(152f, 178.81f)
                verticalLineTo(141.86f)
                lineTo(96f, 174.19f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(204.5f, 107.5f)
                lineTo(160f, 81.81f)
                lineToRelative(-32f, 18.48f)
                horizontalLineToRelative(0f)
                lineToRelative(56f, 32.33f)
                verticalLineTo(184f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, 13f)
                horizontalLineToRelative(0f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 204.5f, 107.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(104f, 141.86f)
                verticalLineTo(77.19f)
                lineTo(148.5f, 51.5f)
                arcToRelative(47.77f, 47.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.19f, -5f)
                verticalLineToRelative(0f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 72f)
                verticalLineToRelative(51.38f)
                lineToRelative(32f, 18.48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 141.86f)
                verticalLineTo(77.19f)
                lineTo(148.5f, 51.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.4f, 64.08f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 155.71f)
                lineTo(72f, 123.38f)
                verticalLineTo(72f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.69f, -25.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 141.86f)
                lineTo(96f, 174.19f)
                lineTo(51.5f, 148.5f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.79f, 59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 114.14f)
                verticalLineToRelative(64.67f)
                lineTo(107.5f, 204.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -66.4f, -64.08f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 100.29f)
                lineToRelative(56f, 32.33f)
                verticalLineTo(184f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -88.69f, 25.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 114.14f)
                lineToRelative(56f, -32.33f)
                lineToRelative(44.5f, 25.69f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.29f, 89.55f)
            }
        }.build()

        return _OpenAiLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _OpenAiLogoDuotone: ImageVector? = null
