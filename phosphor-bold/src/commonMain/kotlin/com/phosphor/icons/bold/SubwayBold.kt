package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.SubwayBold: ImageVector
    get() {
        if (_SubwayBold != null) {
            return _SubwayBold!!
        }
        _SubwayBold = ImageVector.Builder(
            name = "Bold.SubwayBold",
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
                moveTo(40f, 208f)
                verticalLineTo(96f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
                horizontalLineToRelative(48f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
                verticalLineTo(208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 80f)
                lineTo(160f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 96f)
                lineTo(176f, 168f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 184f)
                lineTo(96f, 184f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 168f)
                lineTo(80f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 144f)
                lineTo(176f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 204f)
                lineTo(104f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 184f)
                lineTo(160f, 204f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 152f)
                lineTo(128f, 184f)
            }
        }.build()

        return _SubwayBold!!
    }

@Suppress("ObjectPropertyName")
private var _SubwayBold: ImageVector? = null
