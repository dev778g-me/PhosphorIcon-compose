package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CodesandboxLogoDuotone: ImageVector
    get() {
        if (_CodesandboxLogoDuotone != null) {
            return _CodesandboxLogoDuotone!!
        }
        _CodesandboxLogoDuotone = ImageVector.Builder(
            name = "Duotone.CodesandboxLogoDuotone",
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
                moveTo(80f, 206.84f)
                verticalLineTo(152f)
                lineTo(32f, 125.73f)
                lineToRelative(0f, 50.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.16f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(219.84f, 182.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.16f, -7f)
                verticalLineToRelative(-50.1f)
                lineTo(176f, 152f)
                verticalLineToRelative(54.84f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(172.86f, 47.44f)
                lineTo(131.84f, 25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.68f, 0f)
                lineToRelative(-41f, 22.46f)
                horizontalLineToRelative(0f)
                lineTo(128f, 72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.84f, 25f)
                lineToRelative(88f, 48.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, 7f)
                verticalLineToRelative(95.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.16f, 7f)
                lineToRelative(-88f, 48.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.68f, 0f)
                lineToRelative(-88f, -48.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.16f, -7f)
                verticalLineTo(80.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, -7f)
                lineToRelative(88f, -48.18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.84f, 25f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                lineTo(128f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32.03f, 125.73f)
                lineToRelative(47.97f, 26.27f)
                lineToRelative(0f, 54.84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 125.72f)
                lineToRelative(-48f, 26.28f)
                lineToRelative(0f, 54.84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(83.14f, 47.44f)
                lineToRelative(44.86f, 24.56f)
                lineToRelative(44.86f, -24.56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(33.14f, 76.06f)
                lineToRelative(94.86f, 51.94f)
                lineToRelative(94.86f, -51.94f)
            }
        }.build()

        return _CodesandboxLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CodesandboxLogoDuotone: ImageVector? = null
