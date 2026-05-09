package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BriefcaseBold: ImageVector
    get() {
        if (_BriefcaseBold != null) {
            return _BriefcaseBold!!
        }
        _BriefcaseBold = ImageVector.Builder(
            name = "Bold.BriefcaseBold",
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
                moveTo(112f, 100f)
                lineTo(144f, 100f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 60f)
                lineTo(216f, 60f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 68f)
                lineTo(224f, 196f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 204f)
                lineTo(40f, 204f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 196f)
                lineTo(32f, 68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 60f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 60f)
                verticalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(104f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 40f)
                verticalLineTo(60f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 114.31f)
                arcTo(191.09f, 191.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                arcToRelative(191.14f, 191.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, -25.68f)
            }
        }.build()

        return _BriefcaseBold!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseBold: ImageVector? = null
