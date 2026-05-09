package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.AmazonLogoBold: ImageVector
    get() {
        if (_AmazonLogoBold != null) {
            return _AmazonLogoBold!!
        }
        _AmazonLogoBold = ImageVector.Builder(
            name = "Bold.AmazonLogoBold",
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
                moveTo(240f, 168f)
                lineToRelative(-16f, 16f)
                reflectiveCurveToRelative(-36f, 40f, -96f, 40f)
                reflectiveCurveToRelative(-96f, -40f, -96f, -40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 168f)
                lineToRelative(32f, 0f)
                lineToRelative(0f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(124f, 132f)
                moveToRelative(-44f, 0f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, 0f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -88f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 176f)
                verticalLineTo(84f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87.12f, 60f)
            }
        }.build()

        return _AmazonLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _AmazonLogoBold: ImageVector? = null
