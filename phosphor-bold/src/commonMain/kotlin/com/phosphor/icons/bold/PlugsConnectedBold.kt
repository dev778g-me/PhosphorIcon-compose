package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PlugsConnectedBold: ImageVector
    get() {
        if (_PlugsConnectedBold != null) {
            return _PlugsConnectedBold!!
        }
        _PlugsConnectedBold = ImageVector.Builder(
            name = "Bold.PlugsConnectedBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71.03f, 128.97f)
                lineTo(128.97f, 71.03f)
                arcTo(24f, 24f, 57.69f, isMoreThanHalf = false, isPositiveArc = true, 162.91f, 71.03f)
                lineTo(184.97f, 93.09f)
                arcTo(24f, 24f, 57.69f, isMoreThanHalf = false, isPositiveArc = true, 184.97f, 127.03f)
                lineTo(127.03f, 184.97f)
                arcTo(24f, 24f, 54.32f, isMoreThanHalf = false, isPositiveArc = true, 93.09f, 184.97f)
                lineTo(71.03f, 162.91f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.03f, 128.97f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 88f)
                lineTo(168f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 24f)
                lineTo(173.94f, 82.06f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(82.06f, 173.94f)
                lineTo(24f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 28f)
                lineTo(104f, 44f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(28f, 96f)
                lineTo(44f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(212f, 152f)
                lineTo(228f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 212f)
                lineTo(160f, 228f)
            }
        }.build()

        return _PlugsConnectedBold!!
    }

@Suppress("ObjectPropertyName")
private var _PlugsConnectedBold: ImageVector? = null
