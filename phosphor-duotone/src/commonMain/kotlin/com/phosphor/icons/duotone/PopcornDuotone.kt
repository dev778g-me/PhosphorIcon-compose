package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PopcornDuotone: ImageVector
    get() {
        if (_PopcornDuotone != null) {
            return _PopcornDuotone!!
        }
        _PopcornDuotone = ImageVector.Builder(
            name = "Duotone.PopcornDuotone",
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
                moveTo(104f, 216f)
                lineTo(88f, 96f)
                lineTo(32f, 80f)
                lineTo(62.55f, 209.83f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 70.34f, 216f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(152f, 216f)
                horizontalLineToRelative(33.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.79f, -6.17f)
                lineTo(224f, 80f)
                lineTo(168f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 80f)
                lineTo(62.55f, 209.83f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 70.34f, 216f)
                horizontalLineTo(185.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.79f, -6.17f)
                lineTo(224f, 80f)
                lineTo(168f, 96f)
                lineTo(131f, 81.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.94f, 0f)
                lineTo(88f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 96f)
                lineTo(104f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 96f)
                lineTo(152f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 82.3f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -52.82f, -30.11f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -70.28f, 0f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 82.29f)
            }
        }.build()

        return _PopcornDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PopcornDuotone: ImageVector? = null
